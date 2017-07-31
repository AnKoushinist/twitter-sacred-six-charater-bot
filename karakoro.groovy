def karakoro='唐澤貴洋Aす'
def fullspace='　'
// 5th character
def koro='メ几'
def satu='木又'

def chosen=[]
if(args.length==0){
    6.times{
        chosen<<(int)(5*Math.random())
    }
}else{
    chosen=args[0].toCharArray().collect{"$it"}.collect(Integer.&valueOf)
}
def printHigh=''
def printLow =''
chosen.collect{karakoro[it]}.each{
    if(it=='A'){// special handling: 5th character of IT
        printHigh+=koro
        printLow +=satu
    }else{
        printHigh+=it
        printLow +=fullspace
    }
}
println printHigh
if(printLow.toCharArray().findAll{it!=fullspace}.size()!=0)
    println printLow

