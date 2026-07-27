-- 코드를 입력하세요
SELECT
    ANIMAL_ID, 
    NAME,
    CASE 
           WHEN SEX_UPON_INTAKE LIKE '%Neutered%' OR SEX_UPON_INTAKE LIKE '%Spayed%' THEN 'O'
           ELSE 'X'
    END AS SEX
FROM 
    ANIMAL_INS
# WHERE 
#     SEX_UPON_INTAKE LIKE '%Neutered%' 
#     OR SEX_UPON_INTAKE LIKE '%Spayed%'
ORDER BY ANIMAL_ID;

# 중성화된 동물은 SEX_UPON_INTAKE 컬럼에 'Neutered' 또는 'Spayed'라는 단어
# 아이디와 이름, 중성화 여부('O', 아니라면 'X')를 아이디 순으로 조회