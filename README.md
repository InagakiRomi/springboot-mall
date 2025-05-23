# 🛒 電商實務專案（Spring Boot）

本專案為課程實作的電商後端系統，使用 Java 與 Spring Boot 架構，實作商品、帳號與訂單等核心功能，涵蓋 RESTful API 設計、資料庫操作、基本驗證邏輯與單元測試。強化後端開發實力與實務經驗。

## 🔧 使用技術

- **程式語言**：Java
- **後端框架**：Spring Boot  
- **資料庫**：MySQL  
- **版本控制**：Git  

## 📁 專案功能模組

### 1. 商品管理功能

- 查詢單一商品（含時間格式處理）
- 新增 / 修改 / 刪除商品
- 查詢商品列表（支援條件篩選、排序、分頁、總筆數統計）
- 使用 `Enum` 管理商品類型欄位
- 商品功能單元測試

### 2. 帳號管理功能

- 帳號註冊與 email 重複檢查
- 密碼加密儲存，隱藏敏感返回資訊
- 使用者登入功能
- 帳號功能單元測試

### 3. 訂單管理功能

- 訂單資料庫結構設計
- 創建訂單（含帳號驗證與庫存扣減邏輯）
- 查詢訂單列表

## 🧪 測試機制

- 具備基本單元測試（商品、帳號），確保邏輯正確與功能穩定。

## 📌 補充說明

- 本專案為後端技術實作練習，未包含前端介面。
