# 로또 번호 생성기
# 1~45 까지 숫자를 중복 없이 6개, 중복이 있으면 저장 하지 않고 다시 생성
import random

while True:
    list_rand=[]
    for i in range(0, 6):
        list_rand.append(random.randint(1, 45))
    if len(list_rand)==len(set(list_rand)):
        print("올바른 로또 번호들 {}".format(list_rand))
        break
