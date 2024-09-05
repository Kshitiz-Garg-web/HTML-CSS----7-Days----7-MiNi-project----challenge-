const wordslist=['developer','frontend','coder','engineer']

const span=document.querySelector('.span')


//.........YES ABLE TO WRIYE TILL LAST IN 1 WAY W/O BACK AND FOLLOW
// const word='Front-EnD_Develpoer !'
// let characterindex=0
// setInterval(()=>{
//     if(characterindex==word.length){
//         return
//     }
//     span.innerText=span.innerText+word[characterindex]
//     characterindex++
// },100)



//..............forword + reverse typing is done ok
// const word='Front-EnD_Develpoer_!'
// let characterindex=0
// let reversetype=false
// setInterval(()=>{
    
//     if(reversetype===false){
//         span.innerText=span.innerText+word[characterindex]
//         characterindex++
//     }else{
//         span.innerText=span.innerText.slice(0,span.innerText.length-1) 
//         characterindex--
//     }
//     if(characterindex===word.length && reversetype===false){
//         reversetype=true
//     }
//     if(characterindex===0 && reversetype){
//         reversetype=false  
//     }
// },100)



//...............forword + backword autotyping // array m s lai rha h
// const wordslist=['developer','frontend','coder','engineer']
// let ind=0
// let characterindex=0
// let reversetype=false
// setInterval(()=>{
    
//     if(reversetype===false){
//         span.innerText=span.innerText+wordslist[ind][characterindex]
//         characterindex++
//         console.log('for');
//     }else{
//         span.innerText=span.innerText.slice(0,span.innerText.length-1) 
//         characterindex--
//         console.log('back');
//     }
//     if(characterindex===wordslist[ind].length && reversetype===false){
//         reversetype=true
//     }
//     if(characterindex===0 && reversetype){
//         reversetype=false 
//         ind++
//         console.log('update');
//     }
//      if(ind===wordslist.length){
//         ind=0
//         console.log('over');
//      }
// },100,)


// .............for + back + arrs lena word ko + update/skip/delay you can say__
// let ind=0
// let characterindex=0
// let reversetype=false
// let delay=0
// setInterval(()=>{
    
//     if(delay){
//         delay--
//         return
//     }

//     if(reversetype===false){
//         delay=2
//         span.innerText=span.innerText+wordslist[ind][characterindex]
//         characterindex++
//         console.log('for');
        
//     }else{
//         span.innerText=span.innerText.slice(0,span.innerText.length-1) 
//         characterindex--
//         console.log('back');
        
        
//     }
//     if(characterindex===wordslist[ind].length && reversetype===false){
//         reversetype=true
//         delay=10

//     }
//     if(characterindex===0 && reversetype){
//         reversetype=false 
//         ind++
//         console.log('update');
//     }
//      if(ind===wordslist.length){
//         ind=0
//         console.log('over');
//      }
// },100)   
    







const span1=document.querySelector('h1 .top')
const str1="a popular full-stack development framework that includes the following technologies:"
let str11 = str1.replaceAll(" ", "_")

const span_mongo=document.querySelector('h3 .span-mongo')
const str_mongo="A NoSQL database used for storing data in a flexible, JSON-like format."
let str_mongo1 = str_mongo.replaceAll(" ", "_")

const span_ex=document.querySelector('h3 .span-ex')
const str_ex="A web application framework for Node.js, used for building server-side applications and APIs."
let str_ex1 = str_ex.replaceAll(" ", "_")


const span_re=document.querySelector('h3 .span-re')
const str_re="A frontend library for building user interfaces, particularly single-page applications."
let str_re1 = str_re.replaceAll(" ", "_")


const span_no=document.querySelector('h3 .span-n')
const str_nnn="A JavaScript runtime that allows you to run JavaScript on the server side."
let str_no1 = str_nnn.replaceAll(" ","_")

const span2=document.querySelector('h1 .btn')
const str2="you to build a full-stack web application using JavaScript for both the frontend and backend."
let str22 = str1.replaceAll(" ", "_")



function autotyping(str,element){
    let characterindex=0
let reversetype=false
let dealy=0
setInterval(()=>{

    if(dealy){
        dealy--
        return
    }
    
    if(reversetype===false){
        element.innerText=element.innerText+str[characterindex]
        characterindex++
        dealy=2
    }else{
        element.innerText=element.innerText.slice(0,element.innerText.length-1) 
        characterindex--
        
    }
    if(characterindex===str.length && reversetype===false){
        reversetype=true
        dealy=10
    }
    if(characterindex===0 && reversetype){
        reversetype=false  
    }
},50)
}

autotyping(str11,span1)

autotyping(str_mongo1,span_mongo)
autotyping(str_ex1,span_ex)
autotyping(str_re1,span_re)
autotyping(str_no1,span_no)

autotyping(str22,span2)