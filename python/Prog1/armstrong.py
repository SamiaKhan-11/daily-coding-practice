num=int(input("Enter a number : "))
temp=num
sum=0

while temp>0 :
    d = temp%10
    sum+=d**3
    temp//=10

if sum==num :
    print("Armstrong no")
else:
    print("Not an Armstrong no")
