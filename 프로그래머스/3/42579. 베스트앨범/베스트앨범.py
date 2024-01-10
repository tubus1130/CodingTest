'''
속한 노래가 많이 재생된 장르를 먼저 수록합니다.
장르 내에서 많이 재생된 노래를 먼저 수록합니다.
장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.

장르 키 플레이 합 밸류
2개씩 끊기
정렬하는데 플레이기준으로 람다
'''
def solution(genres, plays):
    answer = []
    genres_dict = {}
    play_dict = {}
    
    for i in range(len(genres)):
        genre = genres[i]
        play = plays[i]
        if genre not in genres_dict:
            genres_dict[genre] = []
            play_dict[genre] = 0
        genres_dict[genre].append((i, play))
        play_dict[genre] += play
        
    sorted_genres = sorted(play_dict.items(), key=lambda x:x[1], reverse=True)
    for genre, _ in sorted_genres:
        sorted_songs = sorted(genres_dict[genre], key=lambda x:(-x[1], x[0]))
        answer.extend([idx for idx, _ in sorted_songs[:2]])
    
    return answer