def solution(lottos, win_nunms):
    # 1~45 숫자
    # 44, 1, 0, 0, 31, 25
    # 31, 10, 45, 1, 6, 19
    # 최고 순위와 최저 순위를 차례로 배열에 담아라
    # 순서는 상관없이 일치하는 숫자만 있으면 된다.
    count=0
    zero_count=0
    low=0
    high=0
    for i in lottos:
        if i==0:
            zero_count+=1

    for i in win_nunms:
        for j in lottos:
            if i==j:
                count+=1
    answer=[]
    if count==6:
        low=1
    elif count==5:
        low=2
    elif count==4:
        low=3
    elif count==3:
        low=4
    elif count==2:
        low=5
    else:
        low=6
    count=count+zero_count
    if count==6:
        high=1
    elif count==5:
        high=2
    elif count==4:
        high=3
    elif count==3:
        high=4
    elif count==2:
        high=5
    else:
        high=6
    answer.append(high)
    answer.append(low)
    #print(answer)
    return answer