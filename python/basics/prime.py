#Wap to print all prime numbers upto a given numbers
n=int(input("Enter a number : "))
for i in range(2,n+1,1):
    j=2
    while(j<int(i/2)):
        if i%j==0:
            break
        j=j+1

    if j==int(i/2)+1:
        print (i)


    