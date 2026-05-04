#Find llargest element in a list
numbers = [10, 45, 67, 23, 89]

largest = numbers[0]

for num in numbers:
    if num > largest:
        largest = num

print("Largest element:", largest)