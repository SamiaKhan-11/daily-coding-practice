# list = [1,2,3,4,5]

# list.append(8)
# list.remove(5)

# print(list)
# print(list[2])
# print(list[1:3])

# d = {"name": "Sam", "age": 20}
# print(d["age"])
# print(d.get("DOB"))
# print(d.keys())
# print(d.values())

# lst = [10, 20, 4, 45, 99]

# l = list(set(lst))   # remove duplicates
# l.sort()

# print("Second largest:", l[-2])

numlist = [10, 20, 4, 45, 99, 101, 1, 48, -2]
# # clone=list(numlist)
# clone=numlist[:]
# print(clone)

# numlist = [1,1,2,2,2,3,3,4,4,4,4,5,5]
# unique = list(set(numlist))
# print(unique)

numlist.sort()
numlist.sort(reverse=True)
print("Sorted List : ", numlist)