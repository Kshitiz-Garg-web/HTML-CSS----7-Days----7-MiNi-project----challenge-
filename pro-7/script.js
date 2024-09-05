const user_input=document.querySelector('.input-feild');
const form=document.querySelector('.container');
const submit=document.querySelector('.submit-btn');
const strt=document.querySelector('.start-game-btn');


let correct_number=Math.round(Math.random()*100);


form.addEventListener(('submit'),(e)=>{
    e.preventDefault();
    const input=parseInt(user_input.value);
    if(input>correct_number){
        console.log('too high!');
        user_input.value="";
    }
    else if(input<correct_number){
        console.log('too low!');
        user_input.value="";
    }
    else{
        console.log('you win');
        user_input.value="";
        strt.disabled = false;
        submit.setAttribute("disabled","true");
        submit.classList.add("submit-off");
        strt.classList.add("start-game");
    }
})

strt.addEventListener(('click'),()=>{
    strt.disabled = true;
    submit.disabled = false;
    submit.classList.remove("submit-off");
    strt.classList.remove("start-game");
   
    correct_number=Math.round(Math.random()*100);
   
})





