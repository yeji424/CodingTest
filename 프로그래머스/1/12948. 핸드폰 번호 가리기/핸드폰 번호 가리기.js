function solution(phone_number) {
    var answer = '';
    const arr = phone_number.split("");
    const len = arr.length;
    
    arr.forEach((ch, i) => {
        if(i < len - 4){
            answer += "*";
        } else{
            answer += ch;
        }
    });
    
    return answer;
}