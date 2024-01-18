def solution(myString, pat):
    answer = 0
    change = ""
    for my in myString:
        if my == "A":
            change += "B"
        else:
            change += "A"
    if pat in change:
        return 1
    else:
        return 0