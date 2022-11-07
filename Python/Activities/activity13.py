# Write a function sum() such that it can accept a list of elements and print the sum of all elements


# def sum(number):
#     total=0
#     for i in number:
#         total+=int(i)
#         return total
#
# numList = list(input("Enter list numbers separated by,").split(", "))
# print(numList)
# res=sum(numList)
# print("sum is", str(res))

# Custom function to calculate sum
def calculate_sum(numbers):
    sum = 0
    for number in numbers:
        sum += int(number)
    print(type(sum))
    return sum

# Define the list of numbers
numList = list(input("Enter list numbers separated by,").split(","))

# Call the sum() function with numList as argument
result = calculate_sum(numList)
print(type(result))
# Print result with message
print("The sum of all the elements is: " + str(result))
