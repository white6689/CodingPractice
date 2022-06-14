# 랜덤한 숫자를 3개 생성해서 리스트 저장
# 3자리수 입력
# 일치하면 스트라이크, 일치하는데 자리가 다르면 볼, 둘다 아니면 아웃이라고 출력
# 스트라이트가 3개면 끝

import random

while True:
    list_rand = []
    list_input = []
    for i in range(0, 3):
        list_rand.append(random.randint(1, 10))

    # 중복 불가능
    while len(list_rand)!=len(set(list_rand)):
        for i in range(0, 3):
            list_rand.append(random.randint(1, 10))

    print(list_rand)
    count = 0
    for i in range(0, 3):
        list_input.append(int(input()))
        #  검사
    for i in range(0, 3):
        if list_rand[i] == list_input[i]:
            count += 1
            print("strike count {}".format(count))
        elif list_rand[0] == list_input[i] or list_rand[1] == list_input[i] or list_rand[2] == list_input[i]:
            print("ball")
        else:
            print("out")
    print(count)
    if count == 3:
        print("complete")
        break