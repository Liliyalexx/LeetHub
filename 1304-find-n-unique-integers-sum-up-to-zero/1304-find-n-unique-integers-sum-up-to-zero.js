/**
 * @param {number} n
 * @return {number[]}
 */
const sumZero = n => {
    let result = [];
    
    if(n %2 !==0) result.push(0);// if odd, add zero
    
    for (let i=0; i < Math.floor(n / 2); i++) {
        result.push(n-i, -n+ i)
        
    }
    return result;

}

console.log(sumZero(5));
console.log(sumZero(4));
console.log(sumZero(3));
console.log(sumZero(2));
console.log(sumZero(1));
console.log(sumZero(0));