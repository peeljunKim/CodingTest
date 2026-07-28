SELECT
    DISTINCT 
    C.CAR_ID
FROM
    CAR_RENTAL_COMPANY_CAR C 
INNER JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY H ON C.CAR_ID = H.CAR_ID 
WHERE 
    C.CAR_TYPE = '세단' 
    AND (DATE_FORMAT(H.START_DATE, '%m')) = 10
ORDER BY C.CAR_ID DESC;


# 자동차 종류는 '세단', 'SUV', '승합차', '트럭', '리무진'
# '세단'인 10월에 대여를 시작한 기록이 있는 자동차 ID 리스트를 출력 (중복 X)
# 단 자동차 ID를 기준으로 내림차순 정렬