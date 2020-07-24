let InputVatLy;
let InputHoaHoc;
let InputSinhHoc;
InputVatLy = prompt('Diem Thi Mon Vat Ly');
InputHoaHoc = prompt('Diem Thi Mon Hoa Hoc');
InputSinhHoc = prompt('Diem Thi Mon Sinh Hoc');
let VatLy = parseInt(InputVatLy);
let HoaHoc = parseInt(InputHoaHoc);
let SinhHoc = parseInt(InputSinhHoc);
let DiemThiTrungBinh = ((VatLy + HoaHoc + SinhHoc)/3);
let TongDiem = (VatLy + HoaHoc + SinhHoc)
document.write("Diem Trung Binh = " + DiemThiTrungBinh);
document.write("<br/>");
document.write("Tong Diem = " + TongDiem);