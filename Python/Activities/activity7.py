
my_list= list(input("Enter list numbers separated by,").split(", "))
sum = 0
print(my_list)

for num in my_list:
    sum =sum+ int(num)
    print(sum)
#
# numbers = input("Enter a sequence of comma separated values: ").split(", ")
# sum = 0
# num=int(numbers)
# for number in num:
#     sum += (num)
#
# print(sum)