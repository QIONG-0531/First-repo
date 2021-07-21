from selenium import webdriver
import time
import os
driver = webdriver.Chrome()
url = "file:///" + os.path.abspath("C:/Users/22987/Desktop/比特/selenium2html/send.html")
driver.get(url)
driver.find_element_by_xpath("/html/body/input").click()
time.sleep(2)
# 获得alert的操作句柄
alert=driver.switch_to.alert
alert.send_keys("hahahhah")
time.sleep(2)
alert.accept()
time.sleep(2)
driver.quit()
