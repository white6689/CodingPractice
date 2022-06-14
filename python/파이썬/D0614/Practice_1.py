# up and down
# 1~50까지 랜덤한 숫자를 뽑는다. 사용자에게 숫자를 입력 받는다.
# 사용자가 입력한 숫자가 크면 '다운', 반대면 '업' 출력, 같으면 종료
import random

while True:
    rand_num=random.randint(1, 50)
    input_num=int(input())
    if rand_num<input_num:
        print("다운")
    elif rand_num>input_num:
        print("업")
    else:
        print("숫자가 {}로 같습니다.".format(input_num))
        break