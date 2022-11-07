# '''Given a two list of numbers create a new list such that new list should contain only odd numbers from the first list and even numbers from the second list.'''

list_1= [1,2,3,4,5,6,7,8,9]
list_2= [1,2,3,4,5,6,7,8,9]

print("orginal input", list[list_1],[list_2])
print(len(list_1))
list=[]
for i in list_1:
    if (i %2 == 1):

        list.append(i)

for i in list_1:
    if (i %2 == 0):

        list.append(i)
print("final",list)