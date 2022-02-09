let num = [5, 8, 4]
num[3] = 7
num.push(6)
console.log(num)
console.log(`O comprimento do vetor é ${num.length}`)
num.sort()
console.log(num)

let pos = num.indexOf(8)
console.log(`O valor está na posição ${pos}`)