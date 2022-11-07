

# my_list= list(input("Enter list numbers separated by,").split(", "))
#
# print(my_list)
#
# l=len(my_list)
#
# if my_list[0]==my_list[-1]:
#     print("lenght",l,True)
#     else:
#         print("lenght",l,False)

# Given list of numbers
numList = list(input("Enter list numbers separated by,").split(","))
print("Given list is ", numList)

# Get first element in list
firstElement = numList[0]
# Get last element in list
lastElement = numList[-1]

# Check if first and last element are equal
if (firstElement == lastElement):
    print(True)
else:
    print(False)