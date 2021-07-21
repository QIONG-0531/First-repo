from selenium import webdriver
import time
import os
driver = webdriver.Chrome()
url = "file:///" + os.path.abspath("C:/Users/22987/Desktop/比特/selenium2html/modal.html")
driver.get(url)
driver.find_element_by_id("show_modal").click()
time.sleep(2)

driver.find_element_by_id("myModal").find_element_by_id("click").click()
time.sleep(2)
# 先定位到div，再选择第一个按钮点击
buttons = driver.find_element_by_class_name("modal-footer").find_elements_by_tag_name("button")
buttons[0].click()
time.sleep(2)
driver.quit()