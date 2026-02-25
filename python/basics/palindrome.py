#Write a program to check a given number is palindrome or not, using while or for loop
# num=int(input("Enter a number : "))
# temp=num
# rev=0
# while temp>0:
#     d=temp%10
#     temp=temp//10
#     rev=rev*10+d
# if (rev==num):
#     print("The number is palindrome")
# else:
#     print("The number is not palindrome")

#Write a really simple program to check a given number is palindrome or not, using for loop
num= (input("Enter a number : "))
rev=""
for digit in num :
    rev = digit + rev
if num == rev :
    print("The number is palindrome")
else:    
    print("The number is not palindrome")

