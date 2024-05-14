SELECT COUNT(*) AS fish_count , n.fish_name
FROM fish_info AS i, fish_name_info AS n
WHERE i.fish_type = n.fish_type
GROUP BY n.fish_name
ORDER BY 1 DESC;