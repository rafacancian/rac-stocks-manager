// assets
import {
  AppstoreAddOutlined,
  AntDesignOutlined,
  BarcodeOutlined,
  BgColorsOutlined,
  FontSizeOutlined,
  LoadingOutlined
} from '@ant-design/icons';

// icons
const icons = {
  FontSizeOutlined,
  BgColorsOutlined,
  BarcodeOutlined,
  AntDesignOutlined,
  LoadingOutlined,
  AppstoreAddOutlined
};

// ==============================|| MENU ITEMS - UTILITIES ||============================== //

const general = {
  id: 'general',
  title: 'General',
  type: 'group',
  children: [
    {
      id: 'general-dashboard',
      title: 'Dashboard',
      type: 'item',
      url: '/',
      icon: icons.FontSizeOutlined
    }
  ]
};

export default general;
