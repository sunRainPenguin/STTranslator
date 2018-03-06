Program() = 
if(Weight>=FullWeight){ 
    State = FULL; 
} 
else if(Weight<=EmptyWeight){ 
    State = EMPTIED; 
} 
else{ 
    State = NOT_FULL; 
} 
if(Command == 1){ 
    EmptyValve = SHUT; 
    FillValve = SelValve(State=FULL,OPEN,SHUT); 
} 
else if(Command == 2){ 
    EmptyValve = SHUT; 
    FillValve = SHUT; 
} 
else if(Command == 3){ 
    if((State=FULL)){ 
        StirSpeed = 100; 
    } 
    else{ 
        StirSpeed = 0; 
    } 
} 
else{ 
    FillValve = SHUT; 
    EmptyValve = OPEN; 
} 
