#WAP to check whether a number is armstrong or not
# a=int(input("Enter a number : "))
# sum=0
# temp=a
# while temp>0:
#     r=temp%10
#     sum=sum+r**3
#     temp=temp//10
# if sum==a:
#     print("Armstrong number")
# else:
#     print("Not an Armstrong number")

n=int(input("Enter a number to check for armstrong : "))

n1=n
nd=0
while n1!=0:
    nd=nd+1
    n1=int(n1/10)

print(nd)

sum=0
n1=n
while n1!=0:
    j=1
    x=n1%10
    xn=1
    while j<=nd:
        xn=xn*x
        j=j+1
    sum=sum+xn
    n1=int(n1/10)
if sum==n:
    print("Armstrong number")
else:
    print("Not an Armstrong number")

        
