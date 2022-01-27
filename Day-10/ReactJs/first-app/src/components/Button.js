

export function Input() {
    return (<div>
         <input type="text" onChange={(event)=>{console.log(event)}} ></input>
    </div>)
}

function Button() {

    let handleClick=(event)=>{
      console.log(event);
    }
    return (<div>
        <button onClick={handleClick}>Click</button>
    </div>)
    
}

export default Button;