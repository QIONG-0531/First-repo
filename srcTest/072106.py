from selenium import webdriver
import time
import os
from selenium.webdriver.common.action_chains import ActionChains
driver = webdriver.Chrome()
url = "file:///" + os.path.abspath("C:/Users/22987/Desktop/比特/selenium2html/upload.html")
driver.get(url)
# 定位到上传按钮，然后添加本地文件
driver.find_element_by_xpath("/html/body/div/div/input").send_keys("C:\\Users\\22987\\Pictures\\111.jpg")
time.sleep(2)
driver.quit()

