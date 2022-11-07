# Make a two-player Rock-Paper-Scissors game.
# Remember the rules:
# Rock beats scissors
# Scissors beats paper
# Paper beats rock

input1 = input("What is your choice chippi\"rock\", \"paper\" ,\"Scissors\" ?\n")
input2= input("What is your choice thummy \"rock\", \"paper\" ,\"Scissors\" ?\n")
if input1 == input2:
    print("it is tie")

elif input1 =="rock":
    if input2 =="paper":
        print("thummy win !! Paper beats rock")
    else:
        print("chippi win!! Paper beats rock")

elif input1 =="paper" :
      if input2 =="Scissors":
        print("chippi win!!  Rock beats scissors")
      else:
        print("thummy win!!  Rock beats scissors")

elif input1 =="Scissors":
        if input2 =="Scissors":
         print("thummy win!!  Scissors beats paper")
        else:
         print("chippi win!!  Scissors beats paper")


else:
    print("invalid")