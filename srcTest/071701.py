from selenium import webdriver
import time

# Chrome  Firefox ,浏览器首字母都是大写
driver=webdriver.Chrome()
# 打开百度网页
driver.get("https://www.baidu.com/")
# 用id去定位
# driver.find_element_by_id("kw").send_keys("迪丽热巴")
# driver.find_element_by_id("su").click()

# 用name去定位
# driver.find_element_by_name("wd").send_keys("地理热泵")
# driver.find_element_by_id("su").click()

# 用class name 去定位
# driver.find_element_by_class_name("s_ipt").send_keys("你好")
# driver.find_element_by_class_name("btn self-btn bg s_btn").click()

# 用link text来定位(链接）
# driver.find_element_by_link_text("新闻").click()

# 用partial link text 来定位（用链接的部分内容）
# driver.find_element_by_partial_link_text("新")

# 用tag name 来定位
# driver.find_element_by_tag_name("input").send_keys("java")
# driver.find_element_by_tag_name("input").click()

# 用xpath来定位
# driver.find_element_by_xpath("//*[@id='kw']").send_keys("java")
# driver.find_element_by_xpath("//*[@id='su']").click()

# 用css selector来定位
driver.find_elements_by_css_selector(" #kw ")
# 添加等待
time.sleep(6)
# 关闭浏览器
driver.quit()
