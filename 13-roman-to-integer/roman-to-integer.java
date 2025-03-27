class Solution {
    public int romanToInt(String s) {
        int talla = s.length(); 
        int res = 0; 
        
         
        for(int i = 0; i<=talla-1; i++){

            if(s.charAt(i)==('I')){
                 if(i != talla-1){
                    char next = s.charAt(i+1);
                 switch(next){
                    case 'V':
                    res+=4;
                    i++;
                    break;
                    case 'X':
                    res+=9;
                    i++;
                    break;
                    case 'I':
                    res+=2;
                    i++;
                    break;
                    case 'L':
                    case 'C':
                    case 'D':
                    case 'M':
                    res+=1;
                    break;
                    
                     }
                }else{res+=1;}

                
                
            }


            else if(s.charAt(i)==('X')){
                 if(i != talla-1){
                    char next = s.charAt(i+1);
                 switch(next){
                    case 'L':
                    res+=40;
                    i++;
                    break;
                    case 'C':
                    res+=90;
                    i++;
                    break;
                    case 'X':
                    res+=20;
                    i++;
                    break;
                    case 'M':
                    case 'D':
                    case 'V':
                    case 'I':
                    res+=10;
                    break;
                    
                }}else{res+=10; }

                
            }

            else if(s.charAt(i)==('C')){
                 if(i != talla-1){
                    char next = s.charAt(i+1);
                 switch(next){
                    case 'D':
                    res+=400;
                    i++;
                    break;
                    case 'M':
                    res+=900;
                    i++;
                    break;
                    case 'C':
                    res+=200;
                    i++;
                    break;
                    case 'L':
                    case 'X':
                    case 'V':
                    case 'I':
                    res+=100;
                    break;
                    
                }}else{res+=100;}



                    

            }
            
            else if(s.charAt(i)==('L')){res+=50;}
            else if(s.charAt(i)==('V')){res+=5;}
            else if(s.charAt(i)==('D')){res+=500;}
            else if(s.charAt(i)==('M')){res+=1000;}
            
        }

        
        return res;

    }
 }
