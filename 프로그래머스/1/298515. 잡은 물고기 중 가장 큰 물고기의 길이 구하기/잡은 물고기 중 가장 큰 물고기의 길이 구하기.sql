SELECT CONCAT(MAX(LENGTH), 'cm') AS MAX_LENGTH 
FROM FISH_INFO;



# FISH_INFO 테이블 이름
# 잡은 물고기의 길이가 10cm 이하일 경우에는 LENGTH 가 NULL 이며, LENGTH 에 NULL 만 있는 경우는 없습니다.
# 가장 큰 물고기 길이를 cm를 붙이고 칼럼명은 MAX_LENGTH