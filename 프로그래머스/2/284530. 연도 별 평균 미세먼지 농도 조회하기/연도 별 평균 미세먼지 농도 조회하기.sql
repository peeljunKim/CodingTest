SELECT 
    YEAR(YM), 
    ROUND(AVG(PM_VAL1), 2) AS PM10,
    ROUND(AVG(PM_VAL2), 2) AS 'PM2.5'
FROM 
    AIR_POLLUTION 
WHERE LOCATION2 = '수원'
GROUP BY YEAR(YM)
ORDER BY YEAR(YM);

# 수원 지역의 연도 별 평균 미세먼지 오염도(PM10), 초미세먼지 오염도(PM2.5) 조회
# 연도 기준 오름차순