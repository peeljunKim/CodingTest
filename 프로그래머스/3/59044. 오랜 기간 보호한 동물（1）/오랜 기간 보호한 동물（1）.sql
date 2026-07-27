# SELECT COUNT(*) FROM ANIMAL_INS;
# SELECT COUNT(*) FROM ANIMAL_OUTS;

SELECT 
    # I.*,
    # O.*
    I.NAME,
    I.DATETIME
FROM 
    ANIMAL_INS I 
LEFT JOIN ANIMAL_OUTS O ON I.ANIMAL_ID = O.ANIMAL_ID
WHERE 
    O.ANIMAL_ID IS NULL
ORDER BY I.DATETIME ASC
LIMIT 3;

# ANIMAL_INS 보호 시작일
# ANIMAL_OUTS 입양일 

# 아직 입양을 못 간 동물 중 가장 보호소에서 있었던 동물 3마리의 이름과 보호 시작일을 조회
# 단 보호 시작일 순으로 조회
# 입양 못 갈걸 어떻게 알지?