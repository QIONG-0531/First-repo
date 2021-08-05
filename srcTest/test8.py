from selenium import webdriver
import time
import os

driver = webdriver.Chrome()
filepath = "file:///"+os.path.abspath("C:/Users/22987/Desktop/比特/selenium2html/alert.html")
driver.get(filepath)
driver.find_element_by_link_text("hover to see tooltip").click()
time.sleep(3)
# 获得alert的操作句柄
alert = driver.switch_to.alert
alert.accept()
time.sleep(2)
driver.quit()