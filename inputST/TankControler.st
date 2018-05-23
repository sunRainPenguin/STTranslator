PROGRAM Main

IF Weight >= FullWeight THEN State:=FULL;
ELSIF Weight <= EmptyWeight THEN State:=EMPTIED;
ELSE State:=NOT_FULL;
END_IF;

CASE Command OF
	1:EmptyValve:=SHUT;
	  FillValve:=SelValve(State=FULL,OPEN,SHUT);
	2:EmptyValve:=SHUT;
	  FillValve:=SHUT;
	3:
    IF(State=FULL) THEN
    	StirSpeed:=100;
    ELSE
    	StirSpeed:=0;	
	END_IF;
	4:
	  FillValve:=SHUT;
	  EmptyValve:=OPEN;
END_CASE;
END_PROGRAM