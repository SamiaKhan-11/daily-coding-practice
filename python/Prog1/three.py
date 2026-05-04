#Random
# import random

# num=random.random()
# print("Random number : ",num)

# num2=random.randint(100,102)
# print("Random number (1-10) : ",num2)

# number=int(input("Enter number : "))
# power=int(input("Enter power : "))
# result=pow(number,power)
# print("Result",result)

# import math
# number=int(input("Enter number : "))
# result=math.sqrt(number)
# print(result)

# num = float(input("Enter number: "))
# print("Absolute value:", abs(num))


year=int(input("Enter year : "))
if (year%4==0 and year%100!=0) or (year%400==0) :
    print("Leap year")
else:
    print("Not a leap year")