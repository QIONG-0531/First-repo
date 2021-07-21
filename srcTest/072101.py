from selenium import webdriver
import time
import os
driver=webdriver.Chrome()
url = "file:///" + os.path.abspath("C:/Users/22987/Desktop/比特/selenium2html/alert.html")
driver.get(url)
driver.find_element_by_link_text("hover to see tooltip").click()
time.sleep(2)
# 首先获得alert的操作句柄
alert = driver.switch_to.alert
# 关闭弹窗
alert.accept()
time.sleep(2)
driver.quit()