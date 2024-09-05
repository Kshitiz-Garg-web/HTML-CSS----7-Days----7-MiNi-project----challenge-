const str=(document.querySelector(".input"))

var check=123435;

let v1=""
function wd(str){
    v1=str.slice(0,3)
    
    const v2=`+(${v1}) - ${str.slice(3,str.length)}`;
   
    return v2
}



    if(( str.value==0 ||str.value==1  ||  
        str.value==2 || str.value==3 || 
        str.value==4 || str.value==5 || 
        str.value==6 || str.value==7 || 
        str.value==8 || str.value==9 ) ){
        
        str.addEventListener("input",(e)=>{

            if(str.value.length===4){
            str.value=wd(str.value)
            }
            let pre=str.value.length
            console.log(pre);
            if(str.value.length===9 && pre==str.value.length){
                console.log('object');
                str.value=v1
            } 
      })
    }


    


