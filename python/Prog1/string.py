text = input("Enter a string: ")
punctuation = ".,!""'';:?"

result = ""

for ch in text:
    if ch not in punctuation:
        result += ch

print("Without punctuation:", result)



text = input("Enter a string: ")

vowels = "aeiouAEIOU"
v_count = 0
c_count = 0

for ch in text:
    if ch.isalpha():
        if ch in vowels:
            v_count += 1
        else:
            c_count += 1

print("Vowels =", v_count)
print("Consonants =", c_count)



text = input("Enter a string: ")
print("Reversed:", text[::-1])



text = input("Enter a string: ")

if text == text[::-1]:
    print("Palindrome")
else:
    print("Not Palindrome")



text = input("Enter a string: ")

print("Uppercase:", text.upper())
print("Lowercase:", text.lower())