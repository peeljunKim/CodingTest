SELECT 
    DISTINCT
    D.ID,
    D.EMAIL,
    D.FIRST_NAME,
    D.LAST_NAME 
FROM 
    DEVELOPERS D
INNER JOIN 
    SKILLCODES S ON (D.SKILL_CODE & S.CODE) > 0
WHERE S.NAME IN ('Python', 'C#')
ORDER BY D.ID ASC;

# SKILLCODES 언어 정보 / CODE 칼럼 2의 제곱수
# DEVELOPERS 스킬 정보 / SKILL_CODE 10진수?

# ID, 이메일, 이름, 성을 조회
# 조건:  Python(256 / 100000000) OR C# (4 / 100) 
# 정렬: ID 오름차순