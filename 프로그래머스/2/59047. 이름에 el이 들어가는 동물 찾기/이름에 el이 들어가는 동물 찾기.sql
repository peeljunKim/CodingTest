SELECT
    ANIMAL_ID, 
    NAME 
FROM 
    ANIMAL_INS A
WHERE 
    ANIMAL_TYPE = 'Dog'
    AND (NAME LIKE '%el%' OR NAME LIKE '%EL%' OR NAME LIKE '%El%' OR NAME LIKE '%eL%')
ORDER BY NAME, ANIMAL_ID;

# 개의 아이디, 이름 조회
# 조건: 이름에 el이 들어가야됨
# 정렬: 이름 순으로 / 이름이 같은 경우 아이디를 기준
