function solution(friends, gifts) {
    const count = friends.length;

    const nameMap = {};
    friends.forEach((name, i) => {
        nameMap[name] = i;
    });

    const giftHis = Array.from({ length: count }, () => Array(count).fill(0));

    const giveCount = Array(count).fill(0);
    const receiveCount = Array(count).fill(0);

    gifts.forEach((gift) => {
        const [from, to] = gift.split(" ");
        const i = nameMap[from];
        const j = nameMap[to];
        giftHis[i][j]++;
        giveCount[i]++;
        receiveCount[j]++;
    });

    const giftCount = Array(count).fill(0);
    friends.forEach((_, i) => {
        giftCount[i] = giveCount[i] - receiveCount[i];
    });

    const nextGiftCount = Array(count).fill(0);

    for (let i = 0; i < count; i++) {
        for (let j = i + 1; j < count; j++) {
            if (giftHis[i][j] > giftHis[j][i]) {
                nextGiftCount[i]++;
            } else if (giftHis[i][j] < giftHis[j][i]) {
                nextGiftCount[j]++;
            } else {
                if (giftCount[i] > giftCount[j]) {
                    nextGiftCount[i]++;
                } else if (giftCount[i] < giftCount[j]) {
                    nextGiftCount[j]++;
                }
            }
        }
    }

    return Math.max(...nextGiftCount);
}
