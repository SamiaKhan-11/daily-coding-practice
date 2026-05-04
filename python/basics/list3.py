#find smallest element in a list
numbers = [10, 45, 67, 23, 89]

smallest = numbers[0]

for num in numbers:
    if num < smallest:
        smallest = num

print("Smallest element:", smallest)