from selenium import webdriver
import time
import os

driver = webdriver.Chrome()
filepath = "file:///"+os.path.abspath("C:/Users/22987/Desktop/比特/selenium2html/upload.html")
driver.get(filepath)
driver.find_element_by_xpath('/html/body/div/div/input').send_keys("C:\\Users\\22987\\Pictures\\111.jpg")
time.sleep(3)
driver.quit()
