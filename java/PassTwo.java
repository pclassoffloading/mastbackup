//This program simulates Pass 2
//
//Pass 2
//
// for each sourceline
//    get LOCCTR
//    operation = sourceline.getMnumonic
//    if operation exists in OPTAB (i.e. ADD, STA, etc)
//    if(OPTAB.find(operation) != Null)
//       grap opcode
//       opcode = OPTAB.find(operation).getOpcode;
//       
//       get format
//       format = sourceline.getFormat
//
//       switch(format):
//
//          case: 2
//
//          case: 3
//                First try PC mode
//                if PC mode fail
//                   try BASE mode
//                      if BASE mode fail
//                         fail source line, print error "format 4 needed for instruction"
//
//          case 4:
//                find target address
//                targetAddress = (SYMTAB.find(sourceLine.getSymbol)).getAddress
//                object code = opject code and target address
//                format of object code is four bytes: ## ## ## ##
//                first two bytes is opcode code
//                last four bytes are target address
//
//          default:
//                  should not reach here
//
//
//         write object code to text file