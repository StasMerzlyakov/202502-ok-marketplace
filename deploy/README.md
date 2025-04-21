# deploy

## Настройка
Для корректного запуска файлов, необходимо добавить в настройки ядра Linux следующий параметр:


#/etc/sysctl.conf
```
vm.max_map_count = 262144
```

# sudo sysctl -p 


sudo apt install docker-compose python3-setuptools
