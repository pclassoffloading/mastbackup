//Scenario 1
//
//This file simulates in detail a line of code from a program
//
//
// Consider the input file below
//
//SUM	START	0
// FIRST	LDX    #0
// 		LDA    #0
// 		+LDB   #TABLE2
// 		BASE 	TABLE2
// LOOP	ADD 	TABLE,X
// 		ADD 	TABLE2,X
// 		TIX	COUNT
// 		JLT 	LOOP
// 		+STA 	TOTAL
// 		RSUB
// COUNT 	RESW 	1
// TABLE 	RESW	2000
// TABLE2 	RESW 	2000
// TOTAL 	RESW 	1
// 		END 	FIRST

//During Pass 1 address will be assigned to each source line that uses space in the program
//This would result in the following
//
//0000 SUM	START	0
//0000 FIRST	LDX    #0
//0003 		   LDA    #0
//0006 		   +LDB   #TABLE2
//     		   BASE 	 TABLE2
//000A LOOP	   ADD 	TABLE,X
//000D 		   ADD 	TABLE2,X
//0010 		   TIX	COUNT
//0013 		   JLT 	LOOP
//0016 		   +STA 	TOTAL
//001A 		   RSUB
//001D COUNT 	RESW 	1
//0020 TABLE 	RESW	2000
//1790 TABLE2 	RESW 	2000
//2F00 TOTAL 	RESW 	1
//2F03    		END 	FIRST
//
//
//Next Pass Two will generate object code from the results of Pass 1
//
// Let's look at line FIRST LDX #0
//
// First we need the LOCCTR at that line
// PC register will be set to the next line address
// PC = next sourceline.getAddress
// in this case PC = 0003
//
// Next we need to determine the format number of the operation/mnumonic
// We do this by looking at OPTAB
// operation =  OPTAB.find(sourceline.getMnumonic)
// formatN = operation.getFormatN
//
// then based on the format N we decide how to calculate the object code
// for this instruction the format number is 3
// in format 3 we always first try to determine the displacement by PC relative mode
//
// so now we look at the label
// label = sourceline.getLabel
// in this case label is a constant "#0" 
// thus we use what is called simple direct addressing
// 
// 
// opcode = operation.getOpcode
// in this case opcode = 04 as that is the opcode of LDX
// 