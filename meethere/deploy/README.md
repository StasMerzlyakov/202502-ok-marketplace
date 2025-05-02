# deploy

## Настройка
Для корректного запуска файлов, необходимо добавить в настройки ядра Linux следующий параметр:


#/etc/sysctl.conf
```
vm.max_map_count = 262144
```

# sudo sysctl -p 


# установка
```
sudo apt install docker-compose python3-setuptools
```

# запуск/остановка, перезапуск
```
docker-compose up --no-start
docker-compose up
docker-compose down
```

# добавление realm meethere, и users - после изменений не забыть выгрузить настройки
http://localhost:8080/admin  (admin:admin; docker-compose.yml)



