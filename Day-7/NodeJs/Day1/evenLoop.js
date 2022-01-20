let x = 30;
let y = 40;
let z = x+y;

console.log(`Z: ${z}`);

setTimeout(()=>{
    console.log("Inside Call back ");
},1000);

console.log("Last line");