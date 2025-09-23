function solution(t, p) {
    
    const pLength = p.length;
    const pNum = Number(p);
    let count = 0;
    
    for(let i = 0; i <= t.length - pLength; i++){
        const tNum = Number(t.slice(i, i + pLength));
        if(tNum <= pNum)
            count++;
    }
    return count;
}